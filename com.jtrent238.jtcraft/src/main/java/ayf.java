/*    */ 
/*    */ 
/*    */ 
/*    */ public class ayf
/*    */ {
/*    */   private final aye[] a;
/*    */   private int b;
/*    */   private int c;
/*    */   
/*    */   public ayf(aye[] paramArrayOfaye)
/*    */   {
/* 12 */     this.a = paramArrayOfaye;
/* 13 */     this.c = paramArrayOfaye.length;
/*    */   }
/*    */   
/*    */   public void a() {
/* 17 */     this.b += 1;
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 21 */     return this.b >= this.c;
/*    */   }
/*    */   
/*    */   public aye c() {
/* 25 */     if (this.c > 0) {
/* 26 */       return this.a[(this.c - 1)];
/*    */     }
/* 28 */     return null;
/*    */   }
/*    */   
/*    */   public aye a(int paramInt) {
/* 32 */     return this.a[paramInt];
/*    */   }
/*    */   
/*    */   public int d() {
/* 36 */     return this.c;
/*    */   }
/*    */   
/*    */   public void b(int paramInt) {
/* 40 */     this.c = paramInt;
/*    */   }
/*    */   
/*    */   public int e() {
/* 44 */     return this.b;
/*    */   }
/*    */   
/*    */   public void c(int paramInt) {
/* 48 */     this.b = paramInt;
/*    */   }
/*    */   
/*    */   public azw a(sa paramsa, int paramInt) {
/* 52 */     double d1 = this.a[paramInt].a + (int)(paramsa.M + 1.0F) * 0.5D;
/* 53 */     double d2 = this.a[paramInt].b;
/* 54 */     double d3 = this.a[paramInt].c + (int)(paramsa.M + 1.0F) * 0.5D;
/* 55 */     return azw.a(d1, d2, d3);
/*    */   }
/*    */   
/*    */   public azw a(sa paramsa) {
/* 59 */     return a(paramsa, this.b);
/*    */   }
/*    */   
/*    */   public boolean a(ayf paramayf) {
/* 63 */     if (paramayf == null) return false;
/* 64 */     if (paramayf.a.length != this.a.length) return false;
/* 65 */     for (int i = 0; i < this.a.length; i++)
/* 66 */       if ((this.a[i].a != paramayf.a[i].a) || (this.a[i].b != paramayf.a[i].b) || (this.a[i].c != paramayf.a[i].c))
/* 67 */         return false;
/* 68 */     return true;
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean b(azw paramazw)
/*    */   {
/* 78 */     aye localaye = c();
/* 79 */     if (localaye == null) return false;
/* 80 */     return (localaye.a == (int)paramazw.a) && (localaye.c == (int)paramazw.c);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ayf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */