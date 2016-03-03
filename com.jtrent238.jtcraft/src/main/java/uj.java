/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class uj
/*     */ {
/*  12 */   private static final Logger a = ;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  25 */   private List b = new ArrayList();
/*  26 */   private List c = new ArrayList();
/*     */   private final qi d;
/*     */   private int e;
/*  29 */   private int f = 3;
/*     */   
/*     */   public uj(qi paramqi) {
/*  32 */     this.d = paramqi;
/*     */   }
/*     */   
/*     */   public void a(int paramInt, ui paramui) {
/*  36 */     this.b.add(new uk(this, paramInt, paramui));
/*     */   }
/*     */   
/*     */   public void a(ui paramui) {
/*  40 */     Iterator localIterator = this.b.iterator();
/*  41 */     while (localIterator.hasNext()) {
/*  42 */       uk localuk = (uk)localIterator.next();
/*  43 */       ui localui = localuk.a;
/*     */       
/*  45 */       if (localui == paramui) {
/*  46 */         if (this.c.contains(localuk)) {
/*  47 */           localui.d();
/*  48 */           this.c.remove(localuk);
/*     */         }
/*     */         
/*  51 */         localIterator.remove();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public void a() {
/*  57 */     ArrayList localArrayList = new ArrayList();
/*     */     uk localuk;
/*  59 */     if (this.e++ % this.f == 0) {
/*  60 */       for (localIterator = this.b.iterator(); localIterator.hasNext();) { localuk = (uk)localIterator.next();
/*  61 */         boolean bool = this.c.contains(localuk);
/*     */         
/*  63 */         if (bool) {
/*  64 */           if ((!b(localuk)) || (!a(localuk))) {
/*  65 */             localuk.a.d();
/*  66 */             this.c.remove(localuk);
/*     */           }
/*     */           
/*     */         }
/*  70 */         else if ((b(localuk)) && (localuk.a.a()))
/*     */         {
/*     */ 
/*     */ 
/*  74 */           localArrayList.add(localuk);
/*  75 */           this.c.add(localuk);
/*     */         }
/*     */       }
/*  78 */     } else { localIterator = this.c.iterator();
/*     */       
/*  80 */       while (localIterator.hasNext()) {
/*  81 */         localuk = (uk)localIterator.next();
/*  82 */         if (!localuk.a.b()) {
/*  83 */           localuk.a.d();
/*  84 */           localIterator.remove();
/*     */         }
/*     */       }
/*     */     }
/*     */     
/*  89 */     this.d.a("goalStart");
/*     */     
/*  91 */     for (Iterator localIterator = localArrayList.iterator(); localIterator.hasNext();) { localuk = (uk)localIterator.next();
/*     */       
/*  93 */       this.d.a(localuk.a.getClass().getSimpleName());
/*  94 */       localuk.a.c();
/*  95 */       this.d.b();
/*     */     }
/*  97 */     this.d.b();
/*     */     
/*  99 */     this.d.a("goalTick");
/*     */     
/* 101 */     for (localIterator = this.c.iterator(); localIterator.hasNext();) { localuk = (uk)localIterator.next();
/*     */       
/* 103 */       localuk.a.e();
/*     */     }
/* 105 */     this.d.b();
/*     */   }
/*     */   
/*     */   private boolean a(uk paramuk) {
/* 109 */     this.d.a("canContinue");
/* 110 */     boolean bool = paramuk.a.b();
/* 111 */     this.d.b();
/* 112 */     return bool;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   private boolean b(uk paramuk)
/*     */   {
/* 120 */     this.d.a("canUse");
/*     */     
/* 122 */     for (uk localuk : this.b) {
/* 123 */       if (localuk != paramuk)
/*     */       {
/* 125 */         if (paramuk.b >= localuk.b) {
/* 126 */           if ((this.c.contains(localuk)) && (!a(paramuk, localuk))) {
/* 127 */             this.d.b();
/* 128 */             return false;
/*     */           }
/* 130 */         } else if ((this.c.contains(localuk)) && (!localuk.a.i())) {
/* 131 */           this.d.b();
/* 132 */           return false;
/*     */         }
/*     */       }
/*     */     }
/* 136 */     this.d.b();
/* 137 */     return true;
/*     */   }
/*     */   
/*     */   private boolean a(uk paramuk1, uk paramuk2) {
/* 141 */     return (paramuk1.a.j() & paramuk2.a.j()) == 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\uj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */