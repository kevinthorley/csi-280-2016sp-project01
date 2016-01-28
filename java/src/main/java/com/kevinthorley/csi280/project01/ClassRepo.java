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
	//searches the array for a section with the given id
	//returns null if no applicable section is found
	for(int i = 0; i < sections.size();i++)
	{
		if((sections.get(i).getId()).equals(id))
		{
			return sections.get(i);
		}
	}
    return null;
  }

  public void addSection(Section section) {
	//adds the passed section into the array
	this.sections.add(section);
  }
}
