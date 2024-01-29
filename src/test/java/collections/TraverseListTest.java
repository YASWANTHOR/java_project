package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraverseListTest {

    TraverseList traverseList = new TraverseList();
    @Test
    public void testListSuccess() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Yaswanth", "Vandavasi", "Venkata"));
        List<String> expectedListOutput = Arrays.asList("Yaswanth", "Vandavasi", "Venkata");
        Assert.assertEquals(expectedListOutput, traverseList.getList(employeeList));
    }

    @Test
    public void testListSuccessEnhanced() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Yaswanth", "Vandavasi", "Venkata"));
        List<String> expectedListOutput = Arrays.asList("Yaswanth", "Vandavasi", "Venkata");
        Assert.assertEquals(expectedListOutput, traverseList.getListEnhancedForLoop(employeeList));
    }
    @Test
    public void testListFailureEnhanced() {
        ArrayList<String> employeeList = new ArrayList<>(Arrays.asList("Yaswanth", "Vandavasi", "Venkata"));
        List<String> expectedListOutput = Arrays.asList("Yaswanth", "Vandavasi", "Venkat");
        Assert.assertNotEquals(expectedListOutput, traverseList.getList(employeeList));
        Assert.assertNotEquals(expectedListOutput, traverseList.getListEnhancedForLoop(employeeList));
    }
}
