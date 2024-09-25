package AssesmentCoding;



class TemporaryEmployee extends Employee{
    int dailyWages;
    int noOfdays;

    TemporaryEmployee(int id, String name,int dailyWages,int noOfdays){
        this.id = id;
        this.name = name;
        this.dailyWages=dailyWages;
        this.noOfdays=noOfdays;
        calculateNetSalary();
        calculateBonus();
    }
    public void calculateBonus(){
        if (dailyWages<1000){
            bonus=0.15f *netsalary;
        } else if (dailyWages>=1000 && dailyWages<1500) {
            bonus = 0.12f * netsalary;
        }else if (dailyWages>=1500 && dailyWages<1750) {
            bonus = 0.11f * netsalary;
        }else{
            bonus =0.08f * netsalary;
        }
    }
    public void calculateNetSalary(){
        netsalary=dailyWages*noOfdays;
    }
}
