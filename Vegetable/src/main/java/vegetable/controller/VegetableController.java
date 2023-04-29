package vegetable.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vegetable.model.VegModel1;
import vegetable.model.VegetableModel;
import vegetable.service.VegetableService;

@RestController
public class VegetableController {
	@Autowired
	VegetableService jeevi;
	@GetMapping("/gop")
	public List<VegetableModel>saveInfo()
	{
		return jeevi.saveInfo();
	}
	@PostMapping("/mon")
	public VegetableModel sub(@RequestBody VegetableModel d)
	{
		return jeevi.sub(d);
	}
	@PutMapping("/log")
	public VegetableModel dub(@RequestBody VegetableModel d)
	{
		return jeevi.dub(d);
	}
	@DeleteMapping("/del/{vin}")
	public void delete(@PathVariable("vin") int price) {
		jeevi.del(price);
	}
	@GetMapping("/auto/{field}")
	public List<VegModel1> sortVeggy(String field){
		return jeevi.sortVeg(field);
	}
	@GetMapping("/auto")
	public List<VegModel1>sortCrudDes(@RequestParam String field){
		return jeevi.sortDesCrud(field);
	}
@GetMapping("/pagination")
	
	public List<VegModel1> pagination(@RequestParam int offset,@RequestParam int pagesize){
		
		return jeevi.getpagination(offset,pagesize);
	}
@GetMapping("/attri")
public List<VegModel1> getByAttri(@RequestParam String attri){
	
	return jeevi.getByAttri(attri);
}
@PostMapping("/reg")
public VegModel1 regid(@RequestBody VegModel1 id) {
	
	System.out.println("registeration successfull");
	return jeevi.register(id);
	
}
@GetMapping("/login")
public String logins(@RequestParam String username, @RequestParam String password){
	
	return jeevi.login(username,password);
}
}