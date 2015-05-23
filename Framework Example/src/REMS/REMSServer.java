package REMS;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import generic.RoverServerRunnable;

public class REMSServer extends RoverServerRunnable {

	public REMSServer(int port) throws IOException {
		super(port);
	}

	REMSData objREMSdata = new REMSData();

	@Override
	public void run() {

		try {
			while (true) {

				System.out
						.println("Module REMS Server: Waiting for client request");

				// creating socket and waiting for client connection
				getRoverServerSocket().openSocket();

				// read from socket to ObjectInputStream object
				ObjectInputStream inputFromAnotherObject = new ObjectInputStream(
						getRoverServerSocket().getSocket().getInputStream());

				// convert ObjectInputStream object to String
				String message = (String) inputFromAnotherObject.readObject();
				System.out
						.println("Module REMS Server: Message Received from Client - "
								+ message.toUpperCase());

				// create ObjectOutputStream object
				ObjectOutputStream outputToAnotherObject = new ObjectOutputStream(
						getRoverServerSocket().getSocket().getOutputStream());

				switch (message) {
				case "REMS_ON":
					System.out.println("REMS is on now");
					break;
				case "GET_DATA":
					objREMSdata.writeJSONData();
					System.out.println("JSON data saved to desktop.");
					break;
				default:
					break;
				}

				// write object to Socket
				// outputToAnotherObject.writeObject("Module REMS Server response Hi Client - "
				// + message);
				// outputToAnotherObject.writeObject("JSON data \n"
				// + objREMSdata.getRemsData() + " \nFrom REMS module"
				// + message);

				// close resources
				inputFromAnotherObject.close();
				outputToAnotherObject.close();

				// getRoverServerSocket().closeSocket();
				// terminate the server if client sends exit request
				if (message.equalsIgnoreCase("exit"))
					break;
			}
			System.out.println("Server: Shutting down Socket server REMS!!");
			// close the ServerSocket object
			closeAll();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception error) {
			System.out.println("Server: Error:" + error.getMessage());
		}

	}

}
