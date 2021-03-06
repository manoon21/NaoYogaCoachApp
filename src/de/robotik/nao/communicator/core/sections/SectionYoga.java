package de.robotik.nao.communicator.core.sections;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import de.robotik.nao.communicator.R;
import de.robotik.nao.communicator.core.RemoteNAO;
import de.robotik.nao.communicator.network.data.NAOCommands;

public class SectionYoga extends Section implements OnClickListener {
	private Button btnYoga;

	public SectionYoga(String nomPage) {
		// TODO Auto-generated constructor stub
		super(nomPage);
	}

	public SectionYoga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// connect ui widgets
		rootView = inflater.inflate(R.layout.page_yoga, container, false);

		// get view
		(btnYoga = (Button) findViewById(R.id.btnYoga)).setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.btnYoga) {
			playProgram();
		}
	}

	private void playProgram() {
		// send command
		RemoteNAO.sendCommand(NAOCommands.PLAY_YOGA);
	}

}
