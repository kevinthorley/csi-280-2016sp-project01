var should = require('should');
var classrepo = require('../lib/classrepo');

describe('ClassRepo', function() {

  var classRepo;

  beforeEach(function() {
    classRepo = new classrepo.ClassRepo();
  });

  describe('findById', function() {
    it('should retrieve a class with the given id', function() {
      var myClass = classRepo.findById('csi-280-51');
      

      should.exist(myClass);
      myClass.name.should.equal('Open Source Software Development');
    });
  });

  describe('add', function() {
    it('should add a new class', function() {
      var newClass = {
        id: 'csi-180',
        name: 'Emerging Technologies',
        semester: '2016SP'
      };

      classRepo.add(newClass);

      var myClass = classRepo.findById('csi-180');

      should.exist(myClass);
      myClass.name.should.equal('Emerging Technologies');
    });
  });
});
