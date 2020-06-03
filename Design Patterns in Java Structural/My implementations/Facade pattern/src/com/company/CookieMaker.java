package com.company;

public class CookieMaker {

    private Cookie PreparareIngredients;
    private Cookie MixIngredients;
    private Cookie HeatingCookies;
    private Cookie CuttingCookie;

    public CookieMaker(Cookie preparareIngredients, Cookie mixIngredients, Cookie heatingCookies, Cookie cuttingCookie) {
        PreparareIngredients = preparareIngredients;
        MixIngredients = mixIngredients;
        HeatingCookies = heatingCookies;
        CuttingCookie = cuttingCookie;
    }

    public CookieMaker(){
        this.CuttingCookie = new CuttingCookie();
        this.PreparareIngredients = new PreparareIngredients();
        this.HeatingCookies = new HeatingCookies();
        this.MixIngredients= new MixIngredients();
    }

    public void PrepareIngredients(){
        PreparareIngredients.cook();
    }
    public void MixIngredients(){
        MixIngredients.cook();
    }
    public void Heating(){
        HeatingCookies.cook();
    }

    public void Cut(){
        CuttingCookie.cook();
    }
}
