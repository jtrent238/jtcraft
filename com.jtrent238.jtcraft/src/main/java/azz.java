/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class azz
/*    */ {
/*  9 */   public static final Comparator a = new baa();
/*    */   
/*    */ 
/*    */ 
/*    */   private final bac b;
/*    */   
/*    */ 
/*    */   private final azx c;
/*    */   
/*    */ 
/*    */   private final String d;
/*    */   
/*    */ 
/*    */   private int e;
/*    */   
/*    */ 
/*    */ 
/*    */   public azz(bac parambac, azx paramazx, String paramString)
/*    */   {
/* 28 */     this.b = parambac;
/* 29 */     this.c = paramazx;
/* 30 */     this.d = paramString;
/*    */   }
/*    */   
/*    */   public void a(int paramInt) {
/* 34 */     if (this.c.c().b()) throw new IllegalStateException("Cannot modify read-only score");
/* 35 */     c(c() + paramInt);
/*    */   }
/*    */   
/*    */   public void b(int paramInt) {
/* 39 */     if (this.c.c().b()) throw new IllegalStateException("Cannot modify read-only score");
/* 40 */     c(c() - paramInt);
/*    */   }
/*    */   
/*    */   public void a() {
/* 44 */     if (this.c.c().b()) throw new IllegalStateException("Cannot modify read-only score");
/* 45 */     a(1);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public int c()
/*    */   {
/* 54 */     return this.e;
/*    */   }
/*    */   
/*    */   public void c(int paramInt) {
/* 58 */     int i = this.e;
/* 59 */     this.e = paramInt;
/* 60 */     if (i != paramInt) f().a(this);
/*    */   }
/*    */   
/*    */   public azx d() {
/* 64 */     return this.c;
/*    */   }
/*    */   
/*    */   public String e() {
/* 68 */     return this.d;
/*    */   }
/*    */   
/*    */   public bac f() {
/* 72 */     return this.b;
/*    */   }
/*    */   
/*    */   public void a(List paramList) {
/* 76 */     c(this.c.c().a(paramList));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\azz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */