/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author channyeintun
 */
public class Context
{
    SortStrategy strategy;

    public SortStrategy getStrategy()
    {
        return strategy;
    }

    public void setStrategy(SortStrategy strategy)
    {
        this.strategy = strategy;
    }
    public void sort()
    {
        this.strategy.sort();
    }
    
}
