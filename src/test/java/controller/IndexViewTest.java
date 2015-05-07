package controller;

import model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by turgaycan on 5/8/15.
 */
@RunWith(MockitoJUnitRunner.class)
public class IndexViewTest {

    @InjectMocks
    private IndexView view;

    @Test
    public void shouldPassParametersToAnotherView() {
        User user = new User("turgay", "turgay@turgaycan.com");
        view.setUser(user);

        String urlWithParams = view.passParams();

        assertThat(urlWithParams, is("/user.xhtml?faces-redirect=true&paramUserName=turgay&paramEmail=turgay@turgaycan.com"));
    }

}