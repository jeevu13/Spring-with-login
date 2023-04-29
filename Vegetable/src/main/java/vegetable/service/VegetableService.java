package vegetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import vegetable.model.VegModel1;
import vegetable.model.VegetableModel;
import vegetable.repository.VegtableRepository;
import vegetable.repository.vegetableRepository1;

@Service
public class VegetableService {
@Autowired
VegtableRepository jj;
@Autowired
vegetableRepository1 jk;
public List<VegetableModel>saveInfo()
{
	List<VegetableModel>VegetableList=jj.findAll();
	return VegetableList;
}
public VegetableModel sub(VegetableModel d) {
	return jj.save(d);
}
public VegetableModel dub(VegetableModel d) {
	return jj.save(d);
}
public void del(int price)
{
	jj.deleteById(price);
} 
public List<VegModel1> sortVeg(String field){
	return jk.findAll(Sort.by(field));
	
}
public List<VegModel1> sortDesCrud(String field) {
	return jk.findAll(Sort.by(Direction.DESC,field));
}
public List<VegModel1> getpagination(int offset, int pagesize) {
	Page<VegModel1>paging=jk.findAll(PageRequest.of(offset, pagesize));
	return paging.getContent();
	}
public List<VegModel1> getByAttri(String attri) {
	return jk.findByUsername(attri);
}
public VegModel1 register(@RequestBody VegModel1 id) {
	return jk.save(id);
}
public String login(String username,String password) {
	List<VegModel1> li = jk.findAll();
	String res = null;
	for(VegModel1 l : li) {
		if(l.getUsername().equals(username)&&l.getPassword().equals(password)) {
			res = "Login sucessfull";
		}
	}
	if(res==null) {
		res= "Login failed";
	}
	return res;
}


}
