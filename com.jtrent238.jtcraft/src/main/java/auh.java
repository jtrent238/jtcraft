/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class auh
/*     */   extends avm
/*     */ {
/*     */   public auh() {}
/*     */   
/*     */   public auh(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*     */   {
/* 122 */     super(paramInt1, paramInt2);
/*     */     
/* 124 */     aui.b();
/*     */     
/* 126 */     auz localauz = new auz(0, paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2);
/* 127 */     this.a.add(localauz);
/* 128 */     localauz.a(localauz, this.a, paramRandom);
/*     */     
/* 130 */     List localList = localauz.c;
/* 131 */     while (!localList.isEmpty()) {
/* 132 */       int i = paramRandom.nextInt(localList.size());
/* 133 */       avk localavk = (avk)localList.remove(i);
/* 134 */       localavk.a(localauz, this.a, paramRandom);
/*     */     }
/*     */     
/* 137 */     c();
/* 138 */     a(paramahb, paramRandom, 10);
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\auh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */