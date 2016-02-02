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
  for (var i = 0, len = this.classList.length; i < len; i++)
  {
    if (this.classList[i].id == id) {
      console.log("Value's are equal");
      return this.classList[i];
    }
  }
}

ClassRepo.prototype.add = function(myClass) {
  this.classList.push(myClass);

}
