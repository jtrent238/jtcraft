/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Random;
/*    */ 
/*    */ public abstract class bhr
/*    */ {
/*    */   public float p;
/*    */   public boolean q;
/* 11 */   public List r = new ArrayList();
/* 12 */   public boolean s = true;
/* 13 */   private Map a = new HashMap();
/* 14 */   public int t = 64;
/* 15 */   public int u = 32;
/*    */   
/*    */ 
/*    */   public void a(sa paramsa, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {}
/*    */   
/*    */ 
/*    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, sa paramsa) {}
/*    */   
/*    */   public void a(sv paramsv, float paramFloat1, float paramFloat2, float paramFloat3) {}
/*    */   
/*    */   public bix a(Random paramRandom)
/*    */   {
/* 27 */     return (bix)this.r.get(paramRandom.nextInt(this.r.size()));
/*    */   }
/*    */   
/*    */   protected void a(String paramString, int paramInt1, int paramInt2) {
/* 31 */     this.a.put(paramString, new biy(paramInt1, paramInt2));
/*    */   }
/*    */   
/*    */   public biy a(String paramString) {
/* 35 */     return (biy)this.a.get(paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bhr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */