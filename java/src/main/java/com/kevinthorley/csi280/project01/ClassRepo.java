package com.kevinthorley.csi280.project01;

import java.util.List;
import java.util.ArrayList;

public class ClassRepo 
{

  private List<Section> sections;

  public ClassRepo() 
  {
    this.sections = new ArrayList<Section>();
    this.sections.add(new Section("csi-280-51", "Open Source Software Development", "2016SP"));
    this.sections.add(new Section("csi-280-52", "Open Source Software Development", "2016SP"));
  }

  public Section findById(String id) 
  {
      //Iterates through sections to search for the given id
      for ( int i = 0; i < this.sections.size(); i++ )
          if ( id.equals( this.sections.get(i).getId() ) )
              return this.sections.get(i);
      
    //Returns null if the id is not found
    return null;
  }

  //Adds a section to sections
  public void addSection(Section section) 
  {
    this.sections.add(section);
  }
}
