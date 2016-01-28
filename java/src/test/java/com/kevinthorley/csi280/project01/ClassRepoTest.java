package com.kevinthorley.csi280.project01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ClassRepoTest {

  @Test
  public void testFindById() 
  {
    ClassRepo classRepo = new ClassRepo();

    Section mySection = classRepo.findById("csi-280-51");

    assertNotNull(mySection);
    assertEquals("Open Source Software Development", mySection.getName());
  }

  @Test
  public void testAdd() {
    ClassRepo classRepo = new ClassRepo();

    Section newSection = new Section("csi-180", "Emerging Technologies", "2016SP");
    classRepo.addSection(newSection);

    Section mySection = classRepo.findById("csi-180");

    assertNotNull(mySection);
    assertEquals("Emerging Technologies", mySection.getName());
  }
}
