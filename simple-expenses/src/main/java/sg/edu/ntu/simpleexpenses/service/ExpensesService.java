package sg.edu.ntu.simpleexpenses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.ntu.simpleexpenses.POJO.Expenses;
import sg.edu.ntu.simpleexpenses.repository.ExpensesRepository;

@Service
public class ExpensesService {

    private final ExpensesRepository expensesRepository;

    @Autowired
    public ExpensesService(ExpensesRepository expensesRepository) {
        this.expensesRepository = expensesRepository;
    }

    /*
     * GET ALL
     */
    public List<Expenses> getAllExpenses() {
        return expensesRepository.getAllExpenses();
    }

    /*
     * GET ONE
     */
    public Expenses getExpense(String id) {
        return expensesRepository.getExpense(id);
    }

    /*
     * CREATE
     */
    public Expenses addExpense(Expenses newExpense) {
        return expensesRepository.addExpense(newExpense);
    }

    /*
     * UPDATE
     */
    public Expenses updateExpense(Expenses updateExpense) {
        return expensesRepository.updateExpense(updateExpense);
    }

    /*
     * DELETE
     */
    public List<Expenses> deleteExpense(String id) {
        return expensesRepository.deleteExpense(id);
    }

}
