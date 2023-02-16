package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;


public class RegistryTest {
private Registry registry = new Registry();
@Test
public void TestRegistryIsUnderAge() {
Person person = new Person("santiago", 1014308143, 17, Gender.MALE, true);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.UNDERAGE, result);
}
@Test
public void TestRegistryIsDEAD() {
Person person = new Person("sebastian", 1014308144, 19, Gender.MALE, false);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.DEAD, result);
}
@Test
public void TestRegistryIsInvalidAge() {
Person person = new Person("camilo", 1014308147, 150, Gender.MALE, true);
RegisterResult result = registry.registerVoter(person);
Assert.assertEquals(RegisterResult.INVALID_AGE, result);
}

}