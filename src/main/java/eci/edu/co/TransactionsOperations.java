package eci.edu.co;

import java.util.ArrayList;
import java.util.List;

public class TransactionsOperations {

    /**
     * Joins two transaction arrays
     * @param transactionList1
     * @param transactionList2
     * @return Array with joined elements
     */
    public static List<Transaction> join(List<Transaction> transactionList1, List<Transaction> transactionList2) {
        ArrayList<Transaction> result = new ArrayList<>(transactionList1);
        result.addAll(transactionList2);
        return result;
    }

    // TODO
    public static List<Transaction> add(Transaction t, List<Transaction> transactionList) {
        return null;
    }

    public static List<Transaction> distinct(List<Transaction> transactionList) {
        List<Transaction> distinctTransaction = new ArrayList<>();
        for (Transaction transaction : transactionList) {
            if(!distinctTransaction.contains(transaction)){
                distinctTransaction.add(transaction);
            }
        }
        return distinctTransaction;
    }

    // TODO
    public static Transaction head(List<Transaction> transactionList) {
        return null;
    }

    // TODO
    public static List<Transaction> tail(List<Transaction> transactionList) {
        return null;
    }

    public static Transaction max(List<Transaction> transactionList) {
        Transaction maxTransaction = transactionList.get(0);
        for (Transaction transaction : transactionList) {
                if(transaction.getValueInCop() >= maxTransaction.getValueInCop()) {
                    maxTransaction = transaction;
                }
        }
        return maxTransaction;
    }

    /**
     * Return the transaction with min value in COP
     * @param transactionList
     * @return min value transaction
     */
    public static Transaction min(List<Transaction> transactionList) {
        Transaction mn = null;
        Double max = Double.MAX_VALUE;
        for( Transaction tr : transactionList) {
            Double valueInCop = tr.getValueInCop();
            if( valueInCop < max ) {
                mn = tr;
                max = valueInCop;
            }
        }
        return mn;
    }
}
