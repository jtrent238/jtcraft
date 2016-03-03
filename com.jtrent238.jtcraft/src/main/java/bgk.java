/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class bgk
/*    */   extends bch
/*    */ {
/*    */   protected final bao k;
/*    */   protected final List l;
/*    */   
/*    */   public bgk(bao parambao, int paramInt1, int paramInt2, List paramList)
/*    */   {
/* 16 */     super(parambao, paramInt1, paramInt2, 32, paramInt2 - 55 + 4, 36);
/* 17 */     this.k = parambao;
/* 18 */     this.l = paramList;
/* 19 */     this.i = false;
/*    */     
/* 21 */     a(true, (int)(parambao.l.a * 1.5F));
/*    */   }
/*    */   
/*    */   protected void a(int paramInt1, int paramInt2, bmh parambmh)
/*    */   {
/* 26 */     String str = a.t + "" + a.r + k();
/* 27 */     this.k.l.b(str, paramInt1 + this.a / 2 - this.k.l.a(str) / 2, Math.min(this.b + 3, paramInt2), 16777215);
/*    */   }
/*    */   
/*    */   protected abstract String k();
/*    */   
/*    */   public List l() {
/* 33 */     return this.l;
/*    */   }
/*    */   
/*    */   protected int b()
/*    */   {
/* 38 */     return l().size();
/*    */   }
/*    */   
/*    */   public bgg c(int paramInt)
/*    */   {
/* 43 */     return (bgg)l().get(paramInt);
/*    */   }
/*    */   
/*    */   public int c()
/*    */   {
/* 48 */     return this.a;
/*    */   }
/*    */   
/*    */   protected int d()
/*    */   {
/* 53 */     return this.d - 6;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */