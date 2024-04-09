package company;

public class Engineer extends Employee {
    String programingLanguage;
    
    
    public Engineer(String name ,Department department,String position,
            int employeeId,String programingLanguage) {
        super(name, department, position, employeeId);
        this.programingLanguage = programingLanguage;
     }
    
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。名前：" + name +
                "、プログラミング言語：" + programingLanguage);
        }
    
    //会議に参加するメリットをオーバーライド
    @Override
    public void joinMeeting(){
        department.meeting();
        System.out.println("→技術的な準備を行い、上記の会議に参加します。名前：" + name);
    }
                {
        
    }

}
