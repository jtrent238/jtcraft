/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class baf
/*    */   implements bah
/*    */ {
/*    */   private final String g;
/*    */   
/*    */   public baf(String paramString)
/*    */   {
/* 11 */     this.g = paramString;
/* 12 */     bah.a.put(paramString, this);
/*    */   }
/*    */   
/*    */   public String a()
/*    */   {
/* 17 */     return this.g;
/*    */   }
/*    */   
/*    */   public int a(List paramList)
/*    */   {
/* 22 */     return 0;
/*    */   }
/*    */   
/*    */   public boolean b()
/*    */   {
/* 27 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\baf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */