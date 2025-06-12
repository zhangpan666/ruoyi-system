package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.PlatformPlayTypeItem;
import com.ruoyi.system.service.IPlatformPlayTypeItemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 平台玩法小类Controller
 * 
 * @author ruoyi
 * @date 2025-06-12
 */
@RestController
@RequestMapping("/system/platformPlayTypeItem")
public class PlatformPlayTypeItemController extends BaseController
{
    @Autowired
    private IPlatformPlayTypeItemService platformPlayTypeItemService;

    /**
     * 查询平台玩法小类列表
     */
    @PreAuthorize("@ss.hasPermi('system:platformPlayTypeItem:list')")
    @GetMapping("/list")
    public TableDataInfo list(PlatformPlayTypeItem platformPlayTypeItem)
    {
        startPage();
        List<PlatformPlayTypeItem> list = platformPlayTypeItemService.selectPlatformPlayTypeItemList(platformPlayTypeItem);
        return getDataTable(list);
    }

    /**
     * 导出平台玩法小类列表
     */
    @PreAuthorize("@ss.hasPermi('system:platformPlayTypeItem:export')")
    @Log(title = "平台玩法小类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PlatformPlayTypeItem platformPlayTypeItem)
    {
        List<PlatformPlayTypeItem> list = platformPlayTypeItemService.selectPlatformPlayTypeItemList(platformPlayTypeItem);
        ExcelUtil<PlatformPlayTypeItem> util = new ExcelUtil<PlatformPlayTypeItem>(PlatformPlayTypeItem.class);
        util.exportExcel(response, list, "平台玩法小类数据");
    }

    /**
     * 获取平台玩法小类详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:platformPlayTypeItem:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(platformPlayTypeItemService.selectPlatformPlayTypeItemById(id));
    }

    /**
     * 新增平台玩法小类
     */
    @PreAuthorize("@ss.hasPermi('system:platformPlayTypeItem:add')")
    @Log(title = "平台玩法小类", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PlatformPlayTypeItem platformPlayTypeItem)
    {
        return toAjax(platformPlayTypeItemService.insertPlatformPlayTypeItem(platformPlayTypeItem));
    }

    /**
     * 修改平台玩法小类
     */
    @PreAuthorize("@ss.hasPermi('system:platformPlayTypeItem:edit')")
    @Log(title = "平台玩法小类", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PlatformPlayTypeItem platformPlayTypeItem)
    {
        return toAjax(platformPlayTypeItemService.updatePlatformPlayTypeItem(platformPlayTypeItem));
    }

    /**
     * 删除平台玩法小类
     */
    @PreAuthorize("@ss.hasPermi('system:platformPlayTypeItem:remove')")
    @Log(title = "平台玩法小类", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(platformPlayTypeItemService.deletePlatformPlayTypeItemByIds(ids));
    }
}
