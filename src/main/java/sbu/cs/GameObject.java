package sbu.cs;

// There is no need to modify this interface unless uou plan on adding new universal features.
public interface GameObject {

    void attack(GameObject target);

    void takeDamage(int damage);

    void die();
}
