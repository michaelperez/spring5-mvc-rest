package com.perezma.spring5mvcrest.bootstrap;

import com.perezma.spring5mvcrest.domains.Category;
import com.perezma.spring5mvcrest.domains.Customer;
import com.perezma.spring5mvcrest.repositories.CategoryRepository;
import com.perezma.spring5mvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;

    private CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        loadCategories();

        loadCustomers();

    }

    private void loadCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);


        System.out.println("Data loaded = " + categoryRepository.count() );
    }

    private void loadCustomers() {
        Customer customer1 = new Customer();
        customer1.setId(1L);
        customer1.setFirstname("Fred");
        customer1.setLastname("Flintstone");
        customer1.setCustomerUrl("/api/v1/customers/1");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setId(2L);
        customer2.setFirstname("Wilma");
        customer2.setLastname("Flintstone");
        customer2.setCustomerUrl("/api/v1/customers/2");
        customerRepository.save(customer2);

        System.out.println("Customers loaded = " + customerRepository.count());
    }
}
