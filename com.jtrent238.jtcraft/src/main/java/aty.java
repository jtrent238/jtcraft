/*     */ import java.util.LinkedList;
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
/*     */ public class aty
/*     */   extends avm
/*     */ {
/*     */   public aty() {}
/*     */   
/*     */   public aty(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2)
/*     */   {
/*  88 */     super(paramInt1, paramInt2);
/*  89 */     ahu localahu = paramahb.a(paramInt1 * 16 + 8, paramInt2 * 16 + 8);
/*  90 */     Object localObject; if ((localahu == ahu.J) || (localahu == ahu.K)) {
/*  91 */       localObject = new auc(paramRandom, paramInt1 * 16, paramInt2 * 16);
/*  92 */       this.a.add(localObject);
/*  93 */     } else if (localahu == ahu.u) {
/*  94 */       localObject = new auf(paramRandom, paramInt1 * 16, paramInt2 * 16);
/*  95 */       this.a.add(localObject);
/*     */     } else {
/*  97 */       localObject = new aub(paramRandom, paramInt1 * 16, paramInt2 * 16);
/*  98 */       this.a.add(localObject);
/*     */     }
/*     */     
/* 101 */     c();
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\aty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */