var ClassRepo = exports.ClassRepo = function() {
  this.classList = [];

  this.classList.push({
    id: 'csi-280-51',
    name: 'Open Source Software Development',
    semester: '2016SP',
    location: 'Wick 101',
    startTime: '17:30',
    endTime: '18:45'
  });

  this.classList.push({
    id: 'csi-280-52',
    name: 'Open Source Software Development',
    semester: '2016SP',
    location: 'Joyce 101',
    startTime: '19:00',
    endTime: '20:15'
  });
}

ClassRepo.prototype.findById = function(id) {
  // Make boolean and set it to false.
  // for each object in the array
  //   check its id
  //   if it matches the id given
  //     set that boolean to true
  // if boolean is true, give information to caller.
}

ClassRepo.prototype.add = function(myClass) {
  // Add an object to the array.
}
