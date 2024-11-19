public class employe {
    private int id;
    private String nom;
    private String prenom;
    private String nomD;
    private int grade;

    employe(int id, String nom, String prenom, String nomD,int grade){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomD = nomD;
        this.grade = grade;
    }
    employe(){
        this.id=0;
        this.nom="";
        this.prenom="";
        this.nomD="";
        this.grade=0;
    }

    void setid(int id){
        this.id = id;
    }
    int getid(){
        return id;
    }
    void setnom(String nom){
        this.nom = nom;
    }
    String getnom(){
        return nom;
    }
    void setprenom(String prenom){
        this.prenom = prenom;
    }
    String getprenom(){
        return prenom;
    }
    void setnomD(String nomD){
        this.nomD = nomD;
    }
    String getnomD(){
        return nomD;
    }
    void setgrade(int grade){
        this.grade = grade;
    }
    int getGrade() {return grade;}

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        employe employe = (employe) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomD + '\'' +
                ", grade=" + grade +
                '}';
    }
}
