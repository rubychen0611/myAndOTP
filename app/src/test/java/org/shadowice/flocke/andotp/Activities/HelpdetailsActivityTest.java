package org.shadowice.flocke.andotp.Activities;

import android.os.Bundle;
import android.view.ViewStub;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.shadowice.flocke.andotp.R;

import static org.junit.Assert.*;

public class HelpdetailsActivityTest {
    private HelpdetailsActivity activity;
    @Before
    public void setUp() {
        activity = new HelpdetailsActivity();
    }
    @Test
    public void testOnCreate() {
        activity.onCreate(new Bundle());
        assertEquals("新手导引详情",activity.getTitle().toString());
        //ViewStub stub = activity.findViewById(R.id.container_stub);
        //assertEquals(R.layout.component_help_details2, stub.getLayoutResource());
    }

}