package MutableAndImmutable_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class CompletedClass {
	
	private final String SUBJECT;
	private final Trainer TRAINER;
	private final ArrayList<Trainee> TRAINEES = new ArrayList<Trainee>();
	
	public CompletedClass(String subject, Trainer trainer, List<Trainee> trainees) {
		this.SUBJECT = subject;
		
		Trainer clonedTrainer = new Trainer(trainer.getName());
		for (String s:trainer.getAllStreams()) {
			clonedTrainer.addStream(s);
		}
		this.TRAINER = clonedTrainer;
		
		for (Trainee t:trainees) {
			Trainee clonedTrainee = new Trainee(t.getName(), t.getStream(), t.getWeek());
			TRAINEES.add(clonedTrainee);
		}
	}

	public String getSUBJECT() {
		return SUBJECT;
	}

	public Trainer getTRAINER() {
		Trainer clonedTrainer = new Trainer(TRAINER.getName());
		for (String s:TRAINER.getAllStreams()) {
			clonedTrainer.addStream(s);
		}
		return clonedTrainer;
	}

	public ArrayList<Trainee> getTRAINEES() {
		ArrayList<Trainee> clonedList = new ArrayList<Trainee>();
		for (Trainee t:TRAINEES) {
			Trainee clonedTrainee = new Trainee(t.getName(), t.getStream(), t.getWeek());
			clonedList.add(clonedTrainee);
		}
		return clonedList;
	}
	
	
}
