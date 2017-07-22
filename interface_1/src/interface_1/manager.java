package interface_1;

public class manager {
 public static void main(String[] args) {
	System.out.println("hii iam in manager screen");
	student s=new student();
	teacher t=new teacher();
	school S=new school();
	s.detail();
	s.address();
	t.detail();
	t.address();
	S.detail();
	S.address();
	
}

}
