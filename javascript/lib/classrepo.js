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
  var foundClass = null;
  this.classList.forEach(function(myClass) {
    if (myClass.id === id) {
      foundClass = myClass;
    }
  });

  return foundClass;
}

ClassRepo.prototype.add = function(myClass) {
  if (! this.findById(myClass.id)) {
    this.classList.push(myClass);
  }
}
