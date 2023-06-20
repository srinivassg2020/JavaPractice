package IZO189.core.streams.collect;

public class Student {

    // member variables
    private int rollNumber;
    private String name;
    private int age;

    // constructors
    public Student(int rollId, String name, int age) {
        super();
        this.rollNumber = rollId;
        this.name = name;
        this.age = age;
    }

    // getters & setters
    public int getRollId() {
        return rollNumber;
    }
    public void setRollId(int rollId) {
        this.rollNumber = rollId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // toString()
    @Override
    public String toString() {
        return "Student [rollNumber=" + rollNumber
                + ", name=" + name
                + ", age=" + age
                + "]";
    }

    // hashCode()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + rollNumber;
        return result;
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (rollNumber != other.rollNumber)
            return false;
        return true;
    }
}

