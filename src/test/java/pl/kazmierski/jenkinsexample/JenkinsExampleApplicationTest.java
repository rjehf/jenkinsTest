package pl.kazmierski.jenkinsexample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JenkinsExampleApplicationTest {

    @Test
    void added() {
        JenkinsExampleApplication jenkinsExampleApplication = new JenkinsExampleApplication();
        assertEquals(10,jenkinsExampleApplication.added(5,5));
    }
}