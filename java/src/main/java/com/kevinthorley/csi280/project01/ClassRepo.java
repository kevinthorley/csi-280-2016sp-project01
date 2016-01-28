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

  public Section findById(String id) {      //Finds a course by its ID
    for(int i = 0; i < sections.size(); i++){
        if(id.equals(sections.get(i).getId())){
            return sections.get(i);
        }
    }
    return null;
  }

  public void addSection(Section section) {
    sections.add(section);
  }
}
