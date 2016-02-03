package com.kevinthorley.csi280.project01;

import java.util.List;
import java.util.ArrayList;

public class ClassRepo {

  private List<Section> sections;
  
  public String t;
  
  public ClassRepo() {
    this.sections = new ArrayList<Section>();

    this.sections.add(new Section("csi-280-51", "Open Source Software Development", "2016SP"));
    this.sections.add(new Section("csi-280-52", "Open Source Software Development", "2016SP"));
  }

  public Section findById(String id) {
	 for(int x=0; x < this.sections.size();x=x+1)
	  {
		 Section sec = this.sections.get(x);
		  if ( sec.getId() == id)
		  {
			  return sec;
		  }
	  }
    return null;
  }

  public void addSection(Section section) {
	  this.sections.add(new Section(section.getId(), section.getName(), section.getSemester()));
  }
}

