/*     */ import java.util.Iterator;
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
/*     */ public class avo
/*     */   extends avm
/*     */ {
/*     */   private boolean c;
/*     */   
/*     */   public avo() {}
/*     */   
/*     */   public avo(ahb paramahb, Random paramRandom, int paramInt1, int paramInt2, int paramInt3)
/*     */   {
/*  84 */     super(paramInt1, paramInt2);
/*     */     
/*  86 */     List localList1 = avp.a(paramRandom, paramInt3);
/*     */     
/*  88 */     awa localawa = new awa(paramahb.v(), 0, paramRandom, (paramInt1 << 4) + 2, (paramInt2 << 4) + 2, localList1, paramInt3);
/*  89 */     this.a.add(localawa);
/*  90 */     localawa.a(localawa, this.a, paramRandom);
/*     */     
/*  92 */     List localList2 = localawa.j;
/*  93 */     List localList3 = localawa.i;
/*  94 */     while ((!localList2.isEmpty()) || (!localList3.isEmpty()))
/*     */     {
/*     */ 
/*  97 */       if (localList2.isEmpty()) {
/*  98 */         i = paramRandom.nextInt(localList3.size());
/*  99 */         localObject = (avk)localList3.remove(i);
/* 100 */         ((avk)localObject).a(localawa, this.a, paramRandom);
/*     */       } else {
/* 102 */         i = paramRandom.nextInt(localList2.size());
/* 103 */         localObject = (avk)localList2.remove(i);
/* 104 */         ((avk)localObject).a(localawa, this.a, paramRandom);
/*     */       }
/*     */     }
/*     */     
/* 108 */     c();
/*     */     
/* 110 */     int i = 0;
/* 111 */     for (Object localObject = this.a.iterator(); ((Iterator)localObject).hasNext();) { avk localavk = (avk)((Iterator)localObject).next();
/* 112 */       if (!(localavk instanceof awe)) {
/* 113 */         i++;
/*     */       }
/*     */     }
/* 116 */     this.c = (i > 2);
/*     */   }
/*     */   
/*     */   public boolean d()
/*     */   {
/* 121 */     return this.c;
/*     */   }
/*     */   
/*     */   public void a(dh paramdh)
/*     */   {
/* 126 */     super.a(paramdh);
/*     */     
/* 128 */     paramdh.a("Valid", this.c);
/*     */   }
/*     */   
/*     */   public void b(dh paramdh)
/*     */   {
/* 133 */     super.b(paramdh);
/* 134 */     this.c = paramdh.n("Valid");
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\avo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */