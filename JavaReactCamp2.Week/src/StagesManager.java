
public class StagesManager {
public void Completed(Stages stages) {
	System.out.println(stages.getDay()+"tamamlandı");
}
public void UnCompleted(Stages stages) {
	System.out.println(stages.getDay()+"tamamlanmadı");
}
}
