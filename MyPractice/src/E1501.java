//問題1：社員証を作ろう
//あなたは会社の社員管理システムを作っています。
//条件
//• Company（会社名）
//        • Employee（社員名 と Company）
//        • main で以下を作る
//Company c = new Company("TechCorp");
//Employee e = new Employee("Tanaka", c);
//表示結果（この形で出す）
//社員名: Tanaka
//会社名: TechCorp

class Company {
    String companyName;
    Company(String companyName) {
        this.companyName = companyName;
    }
}
class Employee {
    String employeeName;
    Company companyName;
    Employee(String employeeName, Company companyName) {
        this.employeeName = employeeName;
        this.companyName = companyName;
    }
}

class E1501 {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        Employee e = new Employee("Tanaka", c);
        System.out.println("社員名：" + e.employeeName);
        System.out.println("会社名：" + c.companyName);
    }
}
