package br.com.ds.sci.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class CicloDeVidaListener implements PhaseListener{

	private static final long serialVersionUID = 6385741542045595068L;

	@Override
	public void afterPhase(PhaseEvent pe) {
		System.out.println("Fim: "+ pe.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent pe) {
		System.out.println("Inicio " + pe.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
	
}
