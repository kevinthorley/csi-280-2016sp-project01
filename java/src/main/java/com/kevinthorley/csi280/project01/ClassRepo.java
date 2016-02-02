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
<<<<<<< HEAD
      //  find a section by its id COMPLETED
 	for (int i = 0; i < sections.size(); i++) {
 	if (id == sections.get(i).getId())
 	return (sections.get(i));
 	}
      return null;
    }

  public void addSection(Section section) {
    // TODO: add a section to the repository COMPLETED
	this.sections.add(section);
=======
    // TODO: find a section by its id
    return null;
  }

  public void addSection(Section section) {
    // TODO: add a section to the repository
>>>>>>> f23ca35421d52117ef35593b6740ac47f7e3d46b
  }
}
