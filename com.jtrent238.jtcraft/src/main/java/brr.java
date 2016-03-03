/*    */ import com.google.common.collect.Lists;
/*    */ import com.google.common.collect.Maps;
/*    */ import com.google.common.collect.Sets;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.SortedSet;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class brr
/*    */   implements bqz
/*    */ {
/* 21 */   private static final Logger b = ;
/*    */   
/*    */ 
/*    */   private final brw c;
/*    */   
/*    */   private String d;
/*    */   
/* 28 */   protected static final brs a = new brs();
/* 29 */   private Map e = Maps.newHashMap();
/*    */   
/*    */   public brr(brw parambrw, String paramString) {
/* 32 */     this.c = parambrw;
/*    */     
/* 34 */     this.d = paramString;
/*    */     
/* 36 */     brp.a(a);
/*    */   }
/*    */   
/*    */   public void a(List paramList) {
/* 40 */     this.e.clear();
/*    */     
/* 42 */     for (bra localbra : paramList) {
/*    */       try {
/* 44 */         bse localbse = (bse)localbra.a(this.c, "language");
/* 45 */         if (localbse != null) {
/* 46 */           for (brq localbrq : localbse.a())
/*    */           {
/* 48 */             if (!this.e.containsKey(localbrq.a())) {
/* 49 */               this.e.put(localbrq.a(), localbrq);
/*    */             }
/*    */           }
/*    */         }
/*    */       } catch (RuntimeException localRuntimeException) {
/* 54 */         b.warn("Unable to parse metadata section of resourcepack: " + localbra.b(), localRuntimeException);
/*    */       } catch (IOException localIOException) {
/* 56 */         b.warn("Unable to parse metadata section of resourcepack: " + localbra.b(), localIOException);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(bqy parambqy)
/*    */   {
/* 63 */     ArrayList localArrayList = Lists.newArrayList(new String[] { "en_US" });
/* 64 */     if (!"en_US".equals(this.d)) {
/* 65 */       localArrayList.add(this.d);
/*    */     }
/*    */     
/* 68 */     a.a(parambqy, localArrayList);
/*    */     
/*    */ 
/* 71 */     de.a(a.a);
/*    */   }
/*    */   
/*    */   public boolean a() {
/* 75 */     return a.a();
/*    */   }
/*    */   
/*    */   public boolean b() {
/* 79 */     return (c() != null) && (c().b());
/*    */   }
/*    */   
/*    */   public void a(brq parambrq) {
/* 83 */     this.d = parambrq.a();
/*    */   }
/*    */   
/*    */   public brq c() {
/* 87 */     return this.e.containsKey(this.d) ? (brq)this.e.get(this.d) : (brq)this.e.get("en_US");
/*    */   }
/*    */   
/*    */   public SortedSet d() {
/* 91 */     return Sets.newTreeSet(this.e.values());
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\brr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */