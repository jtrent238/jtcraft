/*     */ import java.util.Arrays;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang3.ArrayUtils;
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
/*     */ public class bes
/*     */   extends bch
/*     */ {
/*     */   private final bew k;
/*     */   private final bao l;
/*     */   private final bci[] m;
/*  20 */   private int n = 0;
/*     */   
/*     */   public bes(bew parambew, bao parambao) {
/*  23 */     super(parambao, parambew.l, parambew.m, 63, parambew.m - 32, 20);
/*  24 */     this.k = parambew;
/*  25 */     this.l = parambao;
/*     */     
/*  27 */     bal[] arrayOfbal1 = (bal[])ArrayUtils.clone(parambao.u.as);
/*  28 */     this.m = new bci[arrayOfbal1.length + bal.c().size()];
/*     */     
/*  30 */     Arrays.sort(arrayOfbal1);
/*     */     
/*  32 */     int i = 0;
/*  33 */     Object localObject = null;
/*     */     
/*  35 */     for (bal localbal : arrayOfbal1) {
/*  36 */       String str = localbal.e();
/*     */       
/*  38 */       if (!str.equals(localObject)) {
/*  39 */         localObject = str;
/*  40 */         this.m[(i++)] = new beu(this, str);
/*     */       }
/*     */       
/*  43 */       int i2 = parambao.l.a(brp.a(localbal.g(), new Object[0]));
/*  44 */       if (i2 > this.n) this.n = i2;
/*  45 */       this.m[(i++)] = new bev(this, localbal, null);
/*     */     }
/*     */   }
/*     */   
/*     */   protected int b()
/*     */   {
/*  51 */     return this.m.length;
/*     */   }
/*     */   
/*     */   public bci b(int paramInt)
/*     */   {
/*  56 */     return this.m[paramInt];
/*     */   }
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
/*     */   protected int d()
/*     */   {
/* 153 */     return super.d() + 15;
/*     */   }
/*     */   
/*     */   public int c()
/*     */   {
/* 158 */     return super.c() + 32;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */