package com.twu.featuretoggle;

import com.twu.featuretoggle.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class HelloControllerTest {

    @InjectMocks
    HelloController helloController = new HelloController();

    @Mock
    FeatureToggle featureToggle;

    @Test
    public void shouldBeReturnHelloWhenFeatureToggleFalse() {
        assertEquals(helloController.get(), "hello");
    }

    @Test
    public void shouldBeReturnWorldWhenFeatureToggleTrue() {
        when(featureToggle.feature1()).thenReturn(true);
        assertEquals(helloController.get(), "world");
    }

    @Test
    public void shouldBeReturnFooWhenFeatureFooIsTrue() {
        assertEquals(helloController.mapGet(), "bar");
    }


}
