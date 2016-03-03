/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.HashSet;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bsa
/*    */   implements bru
/*    */ {
/*    */   private final List a;
/*    */   private final int b;
/*    */   private final int c;
/*    */   private final int d;
/*    */   
/*    */   public bsa(List paramList, int paramInt1, int paramInt2, int paramInt3)
/*    */   {
/* 21 */     this.a = paramList;
/* 22 */     this.b = paramInt1;
/* 23 */     this.c = paramInt2;
/* 24 */     this.d = paramInt3;
/*    */   }
/*    */   
/*    */   public int a() {
/* 28 */     return this.c;
/*    */   }
/*    */   
/*    */   public int b() {
/* 32 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c() {
/* 36 */     return this.a.size();
/*    */   }
/*    */   
/*    */   public int d() {
/* 40 */     return this.d;
/*    */   }
/*    */   
/*    */   private brz d(int paramInt) {
/* 44 */     return (brz)this.a.get(paramInt);
/*    */   }
/*    */   
/*    */   public int a(int paramInt) {
/* 48 */     brz localbrz = d(paramInt);
/*    */     
/* 50 */     if (localbrz.a()) {
/* 51 */       return this.d;
/*    */     }
/* 53 */     return localbrz.b();
/*    */   }
/*    */   
/*    */   public boolean b(int paramInt)
/*    */   {
/* 58 */     return !((brz)this.a.get(paramInt)).a();
/*    */   }
/*    */   
/*    */   public int c(int paramInt) {
/* 62 */     return ((brz)this.a.get(paramInt)).c();
/*    */   }
/*    */   
/*    */   public Set e() {
/* 66 */     HashSet localHashSet = Sets.newHashSet();
/* 67 */     for (brz localbrz : this.a) {
/* 68 */       localHashSet.add(Integer.valueOf(localbrz.c()));
/*    */     }
/*    */     
/* 71 */     return localHashSet;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bsa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */