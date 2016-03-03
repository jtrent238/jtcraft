/*     */ import com.google.common.collect.Lists;
/*     */ import com.google.common.collect.Maps;
/*     */ import java.io.IOException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Map.Entry;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bqf
/*     */   implements bqj, bqz
/*     */ {
/*  21 */   private static final Logger a = ;
/*  22 */   private final Map b = Maps.newHashMap();
/*     */   
/*  24 */   private final Map c = Maps.newHashMap();
/*  25 */   private final List d = Lists.newArrayList();
/*  26 */   private final Map e = Maps.newHashMap();
/*     */   private bqy f;
/*     */   
/*     */   public bqf(bqy parambqy)
/*     */   {
/*  31 */     this.f = parambqy;
/*     */   }
/*     */   
/*     */   public void a(bqx parambqx) {
/*  35 */     Object localObject = (bqh)this.b.get(parambqx);
/*     */     
/*     */ 
/*  38 */     if (localObject == null) {
/*  39 */       localObject = new bpu(parambqx);
/*  40 */       a(parambqx, (bqh)localObject);
/*     */     }
/*     */     
/*  43 */     bqi.b(((bqh)localObject).b());
/*     */   }
/*     */   
/*     */   public bqx a(int paramInt)
/*     */   {
/*  48 */     return (bqx)this.c.get(Integer.valueOf(paramInt));
/*     */   }
/*     */   
/*     */   public boolean a(bqx parambqx, bpz parambpz) {
/*  52 */     if (a(parambqx, parambpz)) {
/*  53 */       this.c.put(Integer.valueOf(parambpz.a()), parambqx);
/*  54 */       return true;
/*     */     }
/*     */     
/*  57 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(bqx parambqx, bqk parambqk) {
/*  61 */     if (a(parambqx, parambqk)) {
/*  62 */       this.d.add(parambqk);
/*  63 */       return true;
/*     */     }
/*     */     
/*  66 */     return false;
/*     */   }
/*     */   
/*     */   public boolean a(bqx parambqx, bqh parambqh) {
/*  70 */     boolean bool = true;
/*     */     try {
/*  72 */       parambqh.a(this.f);
/*     */     } catch (IOException localIOException) {
/*  74 */       a.warn("Failed to load texture: " + parambqx, localIOException);
/*  75 */       parambqh = bqi.a;
/*  76 */       this.b.put(parambqx, parambqh);
/*  77 */       bool = false;
/*     */     } catch (Throwable localThrowable) {
/*  79 */       b localb = b.a(localThrowable, "Registering texture");
/*  80 */       k localk = localb.a("Resource location being registered");
/*  81 */       bqh localbqh = parambqh;
/*     */       
/*  83 */       localk.a("Resource location", parambqx);
/*  84 */       localk.a("Texture object class", new bqg(this, localbqh));
/*     */       
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  91 */       throw new s(localb);
/*     */     }
/*     */     
/*  94 */     this.b.put(parambqx, parambqh);
/*     */     
/*  96 */     return bool;
/*     */   }
/*     */   
/*     */   public bqh b(bqx parambqx) {
/* 100 */     return (bqh)this.b.get(parambqx);
/*     */   }
/*     */   
/*     */   public bqx a(String paramString, bpq parambpq)
/*     */   {
/* 105 */     Integer localInteger1 = (Integer)this.e.get(paramString);
/* 106 */     if (localInteger1 == null) {
/* 107 */       localInteger1 = Integer.valueOf(1);
/*     */     } else {
/* 109 */       localObject = localInteger1;Integer localInteger2 = localInteger1 = Integer.valueOf(localInteger1.intValue() + 1);
/*     */     }
/* 111 */     this.e.put(paramString, localInteger1);
/*     */     
/* 113 */     Object localObject = new bqx(String.format("dynamic/%s_%d", new Object[] { paramString, localInteger1 }));
/* 114 */     a((bqx)localObject, parambpq);
/*     */     
/* 116 */     return (bqx)localObject;
/*     */   }
/*     */   
/*     */   public void e()
/*     */   {
/* 121 */     for (bqj localbqj : this.d) {
/* 122 */       localbqj.e();
/*     */     }
/*     */   }
/*     */   
/*     */   public void c(bqx parambqx) {
/* 127 */     bqh localbqh = b(parambqx);
/* 128 */     if (localbqh != null) {
/* 129 */       bqi.a(localbqh.b());
/*     */     }
/*     */   }
/*     */   
/*     */   public void a(bqy parambqy)
/*     */   {
/* 135 */     for (Map.Entry localEntry : this.b.entrySet()) {
/* 136 */       a((bqx)localEntry.getKey(), (bqh)localEntry.getValue());
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */