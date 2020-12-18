public class Person {
    private Ability ability;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }



    @Override
    public String toString(){
        return "this is a person that " + ability.getSkill();
    }
}
