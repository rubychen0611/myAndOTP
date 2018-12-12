package org.shadowice.flocke.andotp.Activities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinksActivityTest {
    private LinksActivity activity;
    @Before
    public void setUp(){
        activity = new LinksActivity();
        activity.addingData();
    }
    @Test
    public void testAddingDataTrue() {
        assertEquals(9, activity.getOnePieceList().size());
    }
    @Test
    public void testAddingDataFalse() {
        assertEquals(8, activity.getOnePieceList().size());
    }
}
