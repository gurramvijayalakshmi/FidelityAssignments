package AssesmentCoding;


class PermanentEmployee extends Employee{
    int pf;
    PermanentEmployee(int id, String name,float baseSalary,int pf){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.pf=pf;
        calculateBonus();
        calculateNetSalary();
    }

    public void calculateBonus(){
        if (pf<1000){
            bonus=0.1f *baseSalary;
        } else if (pf>=1000 && pf<1500) {
            bonus = 0.115f * baseSalary;
        }else if (pf>=1500 && pf<1800) {
            bonus = 0.12f * baseSalary;
        }else{
            bonus =0.15f * baseSalary;
        }
    }

    public void calculateNetSalary(){
        netsalary=baseSalary-pf;
    }
}
