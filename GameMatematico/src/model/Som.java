package model;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Som {

	private URL urlTelaInicio, urlCertaResposta, urlRespostaErrada;
	private AudioClip musicaTelaInicio, somCertaResposta, somRespostaErrada;

	public Som() {
		urlTelaInicio = getClass().getResource("/somTelaInicio.wav");
		urlCertaResposta = getClass().getResource("/RespostaCorreta.wav");
		urlRespostaErrada = getClass().getResource("/RespostaErrada.wav");

		musicaTelaInicio = Applet.newAudioClip(urlTelaInicio);
		somCertaResposta = Applet.newAudioClip(urlCertaResposta);
		somRespostaErrada = Applet.newAudioClip(urlRespostaErrada);;

	}

	public AudioClip getMusicaTelaInicio() {
		return musicaTelaInicio;
	}

	public AudioClip getSomCertaResposta() {
		return somCertaResposta;
	}

	public AudioClip getSomRespostaErrada() {
		return somRespostaErrada;
	}
}
