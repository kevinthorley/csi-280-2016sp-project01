package com.kevinthorley.csi280.project01;

import java.util.List;
import java.util.ArrayList;

public class ClassRepo {

  private List<Section> sections;

  public ClassRepo() {
    this.sections = new ArrayList<Section>();

    this.sections.add(new Section("csi-280-51", "Open Source Software Development", "2016SP"));
    this.sections.add(new Section("csi-280-52", "Open Source Software Development", "2016SP"));
  }

  public Section findById(String id) {
    for(int i = 0; i < this.sections.size(); i++)
    {
        if (this.sections.get(i).getId() == id)
        {
            return this.sections.get(i);
        }
    }

    return null;
  }

  public void addSection(Section section) {
    this.sections.add(section);
  }
}
